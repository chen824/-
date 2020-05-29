
public class Node {
	
	//左右子节点
	Node lchild, rchild;
	//权值
	int weight;
	//数据
	String data;
	
	public Node(int weight, String data) {
		this.weight = weight;
		this.data = data;
	}

	public Node(Node lchild, Node rchild) {
		super();
		this.lchild = lchild;
		this.rchild = rchild;
		this.weight = lchild.weight + rchild.weight;
		this.data = lchild.data + rchild.data;
	}
	

}