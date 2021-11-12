package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PermutationInStringTest :
    MultipleParametersAlgorithmTest<PermutationInString>(PermutationInString::class) {

    override fun inputValues() =
        listOf(
            arrayOf("ab", "eidbaooo") to true,
            arrayOf("ab", "eidboaoo") to false,
            arrayOf("adc", "dcda") to true,
            arrayOf("hello", "ooolleoooleh") to false,
            arrayOf(
                "ajsbmzgzwrjwvzfxjqasaoreuulzmypibgubyxdbbinkdmmibetcnsekvprichjgjviodllxyqcrbzgwrkmrrtnmfljjtzajghpoyxcqvhouufwfjtclfrrecqqydzuyoawvnwcvpquebdqzssctviwyszhjpzyrhjhczhvfwvvmqffsmdxljkuzxgumsgeaxpogcgstgmqgmaxvtvtpvkipavimzthncsmdhzbylrgzkluhncojblhrdgjwynclbzbloqtupkltrokhhfdbxdncfmaeujfvtwcnqnrfrxukjeprefjttcptdpgjjanipbqtqorfwugztbjszzwekqmllmnupsanxqgrbzdelmqxjwmdlkbvcpxjyasvldwjftetktovoxkbksrjakrsvggwdrgtvpqfgeibybhkdkeckuokduykynvmreyirowvkxxnxjzwtxtasgaaaheefskmyuzyarfyycgiznvlowlaonpacjkwlhnwekhbziitcidcslknvpzplzcajixdhuzrdvhprjyfknepwjbxtgfhduurvixibfswzousjjnydblheoysyxptcpsxgiojcvpegnhbdbnyudslytzsytukrhcghwbpshmqmftpnqwitumzovcnutbcvghvvgasfoerywwejpndtkevysmygwcmlhamglmxiwvysseyphozwnytjecunsbesywipayxxvtypvdevlimywvpdvekzkqigkpgjychxemqlwocnivcyysmvwnqxblubdwynkegwmjzsdclwxyvlpjcoqqkbgtejezffucifrxaehmfcoieyscgiotjzwxpdtnjpinzlrybmdvlndppbxxnlnsdblujiuutzsgcqolbofvntqygsqozwjvnlgvsqphtsujcqsiqwlkdazdypivuriagqedzvxexkvkzlnnyydoavijoubqkpqpwcahtxfuvnkvltbdhtoehxzhwpxswmulwmjtucwlgwlrwpaoedjgraryzcvblaieqfinacqlpxsnezmofdjhvhmimysatnmnmzdravskbkswqobfxclzikeluahnulrsouiltqguoyjcpeioyrtnhcbyncwiyonzhsjwcnevmizkhcrhzgcbsukjsllnvlnqesqnifvkxyfxxanysjoujdsrhgwfarcbvqacedqdabqgguqtjtxztasvlyxjqajfsevrqyaxmezbqtxlfgrdltlskzszgcskhxndnvbrmrtclurrogsvfmeyavffpdmyquyhmyrgoprqtthqmutbomdwqmclpuuybyytizgobsqgplulesxrwokzcgojcskbtlbljtaqkmjkilvhpsyvlioirhcdsqtsvsddhqpgbpziemtvtafdcshoxqagrimqfehnjgnemgglugsixdfebvkekcvsmiwcwuysohwhwisvpkkrbwaqucmlbbulvvqwvpsurexghsnkxoxybhrrulvoenddlobqojsvdthcsrolgfqfamofeezmcqhgrlrwkobpqzvhkyypsaoyvaukxlmatnsygzbdnrvjhchrqaptanlqrunrnywxccdslymkstxpesrioqnuiamboiptmsqjgizkhdalkkcllfqxqsmvwuchrfmqynraxspqsvofqwfedfbxupyuostevhcrjypyffvbmjbfhrtzwwmqffiigwelokmgleogyxjrgbfrutaabvmevlsumwyeqffajfdvewwslehtdypputixbltwokylcsdtznvvhadzztkidhlufkizwkfaywybckwauovumplymvrsytbwnmjcvaheoowyhitihzddkzxqjiyvhhqqtxykvgztgcagcitgunlnefwgycojtijuuhygjfgxvyr",
                "prtwaywvvyqetvwyakpvekjhirlrtxxzyaodvwigtrdaeiizykaebcjuoenyhaoadnvxaasbecfpovauvvffvcnchdgffbbdhsrxigmtljvoqdiwjvsbpbkppvbxkxphzdkqumpuoacghmmicfjmondzxppomayqnvkclqzbuptslgzjnhjqggwedeuxormigkwjkqsgebufhhfdhqfuifnyboecqvnjhcgztlwoahcqwrksdcedhmqiqxjbqhaacrosnupiesatqfeglxfqgpsfiotytnrvgcvntmxblkkdblatbesaransxcvzeconimbuweevufhduxzcvozgrmkvxdwsiuheqqjjxjimliwehsaxmwjrncapcadzswwglxfnxsnpdbbyvxdwrrflwpjduxnwrjdogyrejrkmjpdncvxwqfcfpfcszzkislhxergkssurbjnuxzpzgkbegtkzbpdutwipdygmhbvspuwxxsapddzhppkkfxbrylvipexzubrzfbmhcqutjnqjbenmqfnowvujicgawxxynnzfubskzyihuohhahflqkrfkvvaimaptzqybjgpeomviozqnbmlgwftgeoztgzacujrolhlwkhjnmklhfyclxzmhfanwgvfhlexuxlpusgbgfdvtlccykeflwinskcahspqlesxrybqegqjmpzeiyhgvombebfsuqvnwqcifznxauupzqxmtejumabbwpjjnqvqrekwaackfvvcvbdcfidqytjhmswyovravwdaahiftspjdxwhbmiabtehdkzagabqiokpnmtpkhqfwacexshckfplcruinijigqdbsjqnskocnhchfsjytqkpbrodtffbsuislmyqpuvxruetrcobbibvipsnkrkrbvhguglpjbbotyrpletcpvfsptvlcdklkfrzjmyzzszzevgkezwltnykylohxoivhmfcmmzcxtmnjcbkrvxndxoisymvfengtcezyxozcyfoyvhqdnrxtfubmvvjxkzatdwcgkyplnzduxbvksxdlnstspxummjqukbcswezkkuwvepbjqoyewnbhiwmtxriunlkwdtgwgmgoqckfjcyxkoefbaizjkavybjlhqgfubhkeberznmokjwwbpkndbirtuvyuqqvfevpxedctnkgryructmtzntfkvpxdqznhtnipfeajehxsyraosvvlaivlehljrynbeczxcigrklnbfnlnqulpwoyvpokmwfjzdwwzpwmgiygxtnelwisdcvoflanozvlsadxngdjjbhyniprfwidzhsbtozgolyjerfzmsyeimyjdvzwcauenjnbymdvfoqepgcpcybqxvumijejcfettsdfsvdcgbylwsuaaemkxrvtilmrkscphywzlyrwahhmomqjhelgdgthiaekrbvmsarndqgodtrnowdjnspjjphomabvdbujimrezxfkhzxlkgagibgcavxemdkwtjltnufdfnkvtnhfsoqpntiwtnghlfhpupwhrdcbgjogbedsdyrtzlfcupbkubgzibcgoeuqehnhcfsztbfprrgmfphchqcgjjfxxggrvbpqawjwumuxkbiuujrzpgvwndckqhuhwpwljdntaqyrtwwkydbbduuqznqmbvssqrzixdgqswurstvpvboxykpndvmcrhccfduhjwbczqchwosugacufnoiramiygadmnbkyhtdcmlrliortwobmsirnbmqjchjrfesuodvaxagwfuhqqebjxqalnxaseyrbkmrgajtjmqeimyhrhrrrwvzwhhlddwdgqjvhtxrgntnyxvhjngksndttfqprcwjkoiztsuysbjvjpralkkgmdfzlfiayrbjezoyphgkictjpiqfrmdizcwcjcpyhrhmovytnuawtzdlclnvfkcoksvigpmvnptnqausmbvquhuhthkstmtmugjpjxgslluuxxfhyqtmedsmwglxuuzurkgmqdytrcvnvxrlqssjwoqlvmkmyeftktkmfulcutalzudpsmqvgjtfaegcszttcgxoosgqjhiutpnfmfikekfvokvjzxgjfbefrptsjmqijudwkajsdmztzwrjwvzfxjqasaoreuulzmypibgubyvdbbinkvmmibetcnsekvprichjgjviodllxyqcrbzgwrkmrrtnmfljjtzajghpoyxcqvhouufwfjtclfrrecqqydzuyoawvnwcvpquebdqzssctviwyszhjpzyrhjhczhvfwvvmqffsmwxljkukxgumsgeaxpogcgskgmqgmaxvtvtpvkipavimzthncsmdhzbylrrzkluhncojblhrogjwynclbzbloqtupkltrokhhfdbxdncfmaeujfvtwcnqnrfrxukpeprkfjttcptdpgjjaniybqtqorfwugztbjszzwekqmllmnupsanxqgrbzdelmqxewmdlkbvcpxjeasvldwsftetktovoxkbksrjaersvggwdrgtvpqfueibybhkdzeckuokduykynvmreyirowvklxnxjzwtxthsgaaaheefskhyuzyarfyycgiznvlowlaonpacjtwlhnwekhbziitcidcslknvpzplzcajixdhuzrdvhprjyfknepwjbxtgfhduurvixibfswzousjjnydblheoysyxptcpsxgiojcvpegembdbnyudrlytzsytukrhcghwbpshmqmftpnqwirukzovcnutbcvgvvvgasfoerywwejpndtkovysmygwcmfhamglmxiwvysseyqhozwnytjecunsbesywipayxxvtypvdevlimywvpddjkzkqigkpgjychxemplwocnivcyysmvwnqxblubdwynkegwmjzsdclwxyvlpjcoqqkbgtejezffucifrxaehmfcoieyscgiotjzwxpdtnjpinzlryjmdvlndppbxxnlnsdblujiugtzsgcqolbofvntqygsqozwjvnlgvsqphtsujcqsiqwxkdazdypivuriagqedzvxexkvkzlnnyydoaxijoubqkpqpwcahtxfuvnkvltbdhtoehxzhwpxswmulwmjoucwlgwlrwpaoedjgrarypcvblaiyqfinacqlpxsnezmofdjhvhmimysatnmnmzdravskbkswqobfxclzikeluahnulrsouiltqguoyjcpeioprtnhcbyncwiyonzhsjwcnevmizkhcrhzgcbsukjsllnvlnqesqnifvkxyfxxanysboujdsrhgwfarcbvqacesqdabqgguqtjwxztasvlyxjqajfsevrqyaxmezbqtxlfgrdltlskzszgcskhxndnvbrmrtclutrogsvfmeyavffjdmyquyhmyrgdprqtthqmutbomdwqmclxuuybgytizgobsqgplulesxrwokzcyojcsmbtlbljvaqkmjkilvhpsyvlioirhcdsqtsvdddhqpgbpziemtvtafdcshoxqagrimqfehnjgnemggljgjixdfnbhkekcvsmiwcwuysohwhwisvzkkrbwaqucmlbbulvvqwvpsurexghsnkxoxyhhrrulvoenddlobqojsvdthcsgolgfqfamofeezmcqhgrlrtkobpqzvhkyypsaoyvaukxlmatnsygzbdnrvjhcbrqaptanlqrunrnywxccdslymkstppesrioqnuiamboiptmsqjgizkhdalkkclllqxqsmvwuchrfmqynraxspqsvtfqwfedfbxupyuostevhcrjypyffvbmubfastzwwmqffiigwelowmglgogyxjrgbfrutaabvmevlsumwyeqffajfdvewwslehtbypputixbltdokylcsdgznvvhadzztkidhlufkizwkfaywybckkauovumplymvrsytbwnmjcvaheoewyhitihzddkzxqjiythhqqtxykvgztecagcitgunlnefwgycojtijuuhygjfgxvyrkukwwldvsbhvehtobdgmodtbmaiuccendlwyzcbojtnbzchlkubdvvoyjijzkgyscuelctrpitpfaftxufwxikoqcrsxlzoskvxncumcbhigxobqgpwhbdqxtjamzxuelrvlnijthgoljmrarcgosqlqzcxtukxjuxynnqkywiptwwtchkwndqfhhzsxeavryaybjcuidjbukzmcrwgahpqrmsgztknkfoaeypaemyorbqejfgifraujzjdzkhtdzhadhslqhwgsmuzmmqshsqjwdzssswribmeknttxvodehjosybfleqrgofwdieirdgtftipnqqmdfrgjttkhicdugvtaqxtibveuszsicjpglmdqxkieznybwkymliycilxssaoaffjahuidldmuvqvbftgqxkfwzvkuatgqbjezgfviubuubrukccymrwjgzfftytktbihgqdbgawdsqufxwvbcgssihzqkmrgyrbtdykrihhxtsbsygjyzmyjyycgvtpndoonqdhgrhdnjerjhmbiwhzrzwkduscdtjcxndjpvldzptewgwvkkqakknraduuzvssgxmpvcrhnplwsubqplminqelizpenrcnopyoogdhgmcztulqcmcrglhxsyavtfwavhauscsrtuvyzibpthznsqngwpxjdcgdrisynpjfxliirwyskfjyicfufxjlqrawktujyfttjzlkgytmmkurrwsuvizisewsgaqptntofjqodiliduitavocubvnskliuffpsvftknzlapmgjqffmbsrvduhhigjnskkhbcqequerdzqgcyjlqoxscbxgjixkogjzpvzrduniovkkvatvdgzpupkyjavxmhokgouuitoftdhhrzrkmxtbogxileadtrvbndmxggxegqfacruvqqlhxjmgurwbggqfbkccyqsnkpvhfsgjnicifphizihllesdrqkasdhdkwjzsvsvmwozxoyelirilnqywggxfrwcufbwasgsooofkjwcqgigobkojrarkdqdjclllceosjwuyrwvchusbuyablmjjwmgxpatxkgvmpjhzuyswcfkmgnzforanvkhklhwrlfnpgxsnanskwtptcdcqkiprmzortjrulgzmkyetpufnbpprkjerorforfnbrhlwsinqxehufgjvlglmeqkkfrnxppofdjpvgxxgwjdsxhdfbwscfkgtxxdxnsjsrtiyylmatqvglcidbofstcilzpgodcephqudwqkjyqjfouvdrslrwahbamkavzokwovemypzsqzksusrgvdnezghbyavxbrfqmbrabzcfurnnkvhljdufwbtjbkurgnhikketdzqbeoiulavhymvnfqybocoxwfkoxijouqlkiriozrmoipoxfkirgtscjyqeuubzbdaequjchbrthgkwpwexlzritpbghwbtkdagvummxtctmhbxxfibovfytrcgqggsfthyrhzejyukhyycekgdcytnhloyzmxneqnywmgfdntojwkzdmdlxnkkftafpbqveskwxdixeegukgzrjsxwbneoimkrngxigycjwzghrigfapoklmbmttgqjvyffkyxscjelcjvofforoqqsqvrumntgxwgwytlfleamuatuyxitrhvjjiacaoezmorhvlxmrebfxhcfopjrkreiyxzixzwutarxrqyhtnvuiaczscaguldraqslvvqutzugthofxfadbiygmjszftwywdgwrdalmhneserexzshikthojoqgjkwobgyfrumaxoxaqobzlvdzsoxzucvduimqxbyqmvxvtbwgalhxndrhstprjyywnogtoawcroiztdkpndwvkztxbrzfriandnaaqiqoopfzdsretxbvjqboppxkbgwmahyicwpwllvrlyymezomwkwtogqgbqcvexkleumfgfnhikojuhfszvvnswcegpshnpfnvfvpjcxsjtaitkylsoijdzadzrrevkrtevdzcybvjdqpkeeobbnrzbjlyrhaxzgtmbjzbjpsplghdlbwbyqefbyzindtzgsksufnipj"
            ) to true
        )
}