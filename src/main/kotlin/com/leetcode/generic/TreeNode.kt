package com.leetcode.generic

/**
 * @author Maxim Tereshchenko
 */
class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null) {

    companion object {
        fun of(array: Array<Int?>): TreeNode? {
            if (array.isNullOrEmpty() || array[0] == null) {
                return null
            }

            val root = array[0]?.run { TreeNode(this) } ?: throw IllegalArgumentException()
            val stack = mutableListOf<TreeNode>().apply { add(root) }

            for (i in 1..array.size step 2) {
                stack.last().left = array.elementAtOrNull(i)?.run { TreeNode(this) }
                stack.last().right = array.elementAtOrNull(i + 1)?.run { TreeNode(this) }
                stack.removeLast()
                    .apply {
                        left?.run { stack.add(this) }
                    }
                    .apply {
                        right?.run { stack.add(this) }
                    }
            }

            return root
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TreeNode

        if (`val` != other.`val`) return false
        if (left != other.left) return false
        if (right != other.right) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (left?.hashCode() ?: 0)
        result = 31 * result + (right?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "$`val`(${left?.`val`}, ${right?.`val`})"
    }
}