
public class Node {
	
	//�����ӽڵ�
	Node lchild, rchild;
	//Ȩֵ
	int weight;
	//����
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