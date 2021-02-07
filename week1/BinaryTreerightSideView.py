# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    # @param root, a tree node
    # @return a list of integers
    def rightSideView(self, root):
        result = []
        self.rightSideViewDFS(root, 1, result)
        return result
    
    def rightSideViewDFS(self, node, depth, result):
        if not node:
            return
        
        if depth > len(result):
            result.append(node.val)
        
        self.rightSideViewDFS(node.right, depth+1, result)
        self.rightSideViewDFS(node.left, depth+1, result)
        
