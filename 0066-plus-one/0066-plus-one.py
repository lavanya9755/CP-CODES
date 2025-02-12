class Solution(object):
    def plusOne(self, digits):
        result = int("".join(map(str,digits)))+1 
        ans = list(map(int,str(result)))
        return ans

        