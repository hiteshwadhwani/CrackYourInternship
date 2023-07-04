
#https://leetcode.com/problems/set-matrix-zeroes/description/
class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """

        n = len(matrix)
        m = len(matrix[0])

        row = [False for i in range(n)]
        col = [False for i in range(m)]
 
        for i in range(n):
            for j in range(m):
                if(matrix[i][j] == 0):
                    row[i] = True
                    col[j] = True

        for i in range(n):
            for j in range(m):
                if row[i] == True or col[j] == True:
                    matrix[i][j] = 0

    