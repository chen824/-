import java.util.ArrayList;
import java.util.List;

public class HFMTree {
	
	Node root = null;
	
	//ͳ���ַ������ַ�����
	public List<Node> count(String str) {
		//�洢�����ַ����ֵĴ���
		int times[] = new  int[128]; 
		//�����ַ���
		for(int i=0; i<str.length(); i++) {
			//ȡ��һ���ַ�
			char ch = str.charAt(i);
			//�����Ӧλ�ü�1
			times[ch]++;
		}
		
		//�������飬�����ڵ�
		List<Node> nodes = new ArrayList<Node>();
		for(int i=0; i<times.length; i++) {
			//�ж��ַ��Ƿ����
			if(times[i] > 0) {
				//����һ���ڵ�
				Node node = new Node(times[i],""+(char)i);
				nodes.add(node);
			}
		}
		return nodes;
	}
	
	//����
	public void sort(List<Node> nodes) {
		if not (nodes.length==o || nodes.length==1) {
			int current;
			for (int i = 0; i < nodes.length - 1; i++) {
				current = array[i + 1];
				int preIndex = i;
				while (preIndex >= 0 && current.weight < nodes[preIndex].weight) {
					nodes[preIndex + 1] = nodes[preIndex];
					preIndex--;
				}
				nodes[preIndex + 1] = current;
			}

		}
		
	}
	
	//create
	public void create(List<Node> nodes) {
		//
		while(nodes.size()>1) {
			//ȡ��Ȩֵ��С�������ڵ�
			Node lnode = nodes.remove(0);
			Node rnode = nodes.remove(0);
			//�����½ڵ�
			Node node = new Node(lnode, rnode);
			//�����б���
			nodes.add(node);
			//����
			
		}
		//ʣ�����һ���ڵ�Ϊ���ڵ�
		root = nodes.get(0);
	}
	
	public static void main(String[] args) {
		//
		char ch = 'A';
		int i = ch;
		
	}

}
