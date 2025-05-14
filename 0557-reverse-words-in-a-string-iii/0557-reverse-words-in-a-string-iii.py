class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        def rev(x):
            return x[::-1]
            
        s = s.split()
        new = []

        for i in s:
            new.append(rev(i))

        return " ".join(new)