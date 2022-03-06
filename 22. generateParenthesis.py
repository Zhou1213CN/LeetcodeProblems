class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        def backTrack(S=[], left = 0, right = 0):
            if len(S) == 2*n:
                res.append("".join(S))
            if left < n:
                S.append("(")
                backTrack(S, left+1, right);
                S.pop()
                print(S == A)
            if right < left:
                S.append(")")
                backTrack(S, left, right+1)
                S.pop()
        backTrack()
        return res