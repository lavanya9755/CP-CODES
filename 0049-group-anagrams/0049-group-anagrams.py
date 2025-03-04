class Solution(object):
    def groupAnagrams(self, strs):
        res = {}
        for s in strs:
            key = tuple(sorted(s))
            if key in res:
                res[key].append(s)
            else:
                res[key] = [s]
        return list(res.values())
        