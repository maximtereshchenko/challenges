package com.leetcode

import com.leetcode.generic.ListNode
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MiddleOfTheLinkedListTest :
    SingleParameterAlgorithmTest<MiddleOfTheLinkedList>(MiddleOfTheLinkedList::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(1, 2, 3, 4, 5) to intArrayOf(3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6) to intArrayOf(4, 5, 6),
        )
            .map { ListNode.from(it.first) to ListNode.from(it.second) }
}