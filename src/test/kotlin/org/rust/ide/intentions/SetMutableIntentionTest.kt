/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.ide.intentions

class SetMutableIntentionTest : RsIntentionTestBase(SetMutableIntention()) {
    fun testSetMutableVariable() = doAvailableTest(
        """ fn main() { let var: &i3/*caret*/2 = 52; } """,
        """ fn main() { let var: &mut i3/*caret*/2 = 52; } """
    )

    fun testSetMutableParameter() = doAvailableTest(
        """ fn func(param: &i3/*caret*/2) {} """,
        """ fn func(param: &mut i3/*caret*/2) {} """
    )
}
