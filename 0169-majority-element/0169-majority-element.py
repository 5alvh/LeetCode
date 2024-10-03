class Solution(object):
    def majorityElement(self, nums):
        count = 0
        majElmnt = None
        for n in nums:
            if count == 0 and majElmnt != n:
                majElmnt = n
                count = count + 1
            elif majElmnt != n:
                count = count - 1
            else:
                count = count + 1

        return majElmnt
        """
        :type nums: List[int]
        :rtype: int
        """
        