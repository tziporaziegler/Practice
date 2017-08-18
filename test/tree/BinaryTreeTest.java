package tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void testWhileInsertWithInOrderTraversal() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5, 7, 2, 4, 77, 32, 8, 3 };

		for (int num : numbers) {
			tree.insertWithWhile(num);
		}

		assertEquals(tree.inOrderTraveral(), "2 3 4 5 7 8 32 77 ");
	}

	@Test
	public void testRecursionInsertWithInOrderTraversal() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5, 7, 2, 1, 4, 77, 32, 88, 8, 35, 3 };

		for (int num : numbers) {
			tree.insertWithRecursion(num);
		}

		/* 5
		 * / \
		 * 2 7
		 * / \ \
		 * 1 4 77
		 * / / \
		 * 3 32 88
		 * / \
		 * 8 35 */

		assertEquals(tree.inOrderTraveral(), "1 2 3 4 5 7 8 32 35 77 88 ");
	}

	@Test
	public void testPreorderTraversal() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5, 7, 2, 1, 4, 77, 32, 88, 8, 35, 3 };

		for (int num : numbers) {
			tree.insertWithRecursion(num);
		}

		/* 5
		 * / \
		 * 2 7
		 * / \ \
		 * 1 4 77
		 * / / \
		 * 3 32 88
		 * / \
		 * 8 35 */

		assertEquals(tree.preOrderTraveral(), "5 2 1 4 3 7 77 32 8 35 88 ");
	}

	@Test
	public void testPostOrderTraversal() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5, 7, 2, 1, 4, 77, 32, 88, 8, 35, 3 };

		for (int num : numbers) {
			tree.insertWithRecursion(num);
		}

		/* 5
		 * / \
		 * 2 7
		 * / \ \
		 * 1 4 77
		 * / / \
		 * 3 32 88
		 * / \
		 * 8 35 */

		assertEquals(tree.postOrderTraveral(), "1 3 4 2 8 35 32 88 77 7 5 ");
	}

	@Test
	public void testFindNode() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5, 7, 2, 1, 4, 77, 32, 88, 8, 35, 3 };

		for (int num : numbers) {
			tree.insertWithRecursion(num);
		}

		Node found = tree.findNode(77);

		assertEquals(found.name, "77");
	}

	@Test
	public void testNotFound() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5, 7, 2, 1, 4, 77, 32, 88, 8, 35, 3 };

		for (int num : numbers) {
			tree.insertWithRecursion(num);
		}

		Node found = tree.findNode(6);

		assertNull(found);
	}

	@Test
	public void testComplexInsert() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5, 7, 2, 6, 1, 4, 77, 32, 88, 8, 35, 3, 87, 86, 89 };

		for (int num : numbers) {
			tree.insertWithRecursion(num);
		}

		/* 5
		 * / \
		 * 2 7
		 * / \ / \
		 * 1 4 6 77
		 * / / \
		 * 3 32 88
		 * / \ / \
		 * 8 35 87 89
		 * /
		 * 86 */

		assertEquals(tree.inOrderTraveral(), "1 2 3 4 5 6 7 8 32 35 77 86 87 88 89 ");
	}

	@Test
	public void testRemove() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5, 7, 2, 6, 1, 4, 77, 32, 88, 8, 35, 3, 87, 86, 89 };

		for (int num : numbers) {
			tree.insertWithRecursion(num);
		}

		/* 5
		 * / \
		 * 2 7
		 * / \ / \
		 * 1 4 6 77
		 * / / \
		 * 3 32 88
		 * / \ / \
		 * 8 35 87 89
		 * /
		 * 86 */

		tree.remove(77);

		assertEquals(tree.inOrderTraveral(), "1 2 3 4 5 6 7 8 32 35 86 87 88 89 ");
	}

	@Test
	public void testFindSmallest() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5, 7, 2, 4, 77, 32, 8, 3 };

		for (int num : numbers) {
			tree.insertWithWhile(num);
		}

		assertEquals("2", tree.findSmallestValue());
	}

	@Test
	public void testFindSmallestNull() {
		BinaryTree tree = new BinaryTree();
		assertEquals(null, tree.findSmallestValue());
	}

	@Test
	public void testFindSecondSmallest() {
		BinaryTree tree = new BinaryTree();
		
		/*
		 *          5
		 *       /     \
		 *      2       7
		 *       \     /  \
		 *        4   32   77
		 *       /         /
		 *      3         8
		 */
		

		int[] numbers = { 5, 7, 2, 4, 77, 32, 8, 3 };

		for (int num : numbers) {
			tree.insertWithWhile(num);
		}

		assertEquals("3", tree.findNthSmallestValue(2));
	}

	@Test
	public void testFindSecondSmallestNull() {
		BinaryTree tree = new BinaryTree();
		assertEquals(null, tree.findNthSmallestValue(2));
	}

	@Test
	public void testFindSecondSmallestOneValue() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 5 };

		for (int num : numbers) {
			tree.insertWithWhile(num);
		}

		assertEquals(null, tree.findNthSmallestValue(2));
	}
	
	@Test
	public void testFindSecondSmallestLeftValue() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 1, 2, 3 };

		for (int num : numbers) {
			tree.insertWithWhile(num);
		}

		assertEquals("2", tree.findNthSmallestValue(2));
	}
	
	@Test
	public void testFindSecondSmallestRightValue() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 3, 4 };

		for (int num : numbers) {
			tree.insertWithWhile(num);
		}

		assertEquals("4", tree.findNthSmallestValue(2));
	}
	
	@Test
	public void testFindSecondSmallestRootValue() {
		BinaryTree tree = new BinaryTree();

		int[] numbers = { 2, 1, 3 };

		for (int num : numbers) {
			tree.insertWithWhile(num);
		}

		assertEquals("2", tree.findNthSmallestValue(2));
	}
}
