package �����ڷ���;

public class �����ڷ���Test4 {
	public String findLongestWord(String sentence) {

        // TODO: Write your code here
		
		// ������ �������� �и��Ͽ� �ܾ� �迭 ����
//        String[] word = sentence.split(" ");	//����:���� �̸��� 12���� for�ݺ����� ���� �̸��� ��ħ
        String[] words = sentence.split(" ");	//����
        
     // ���� �� �ܾ ������ ���� �ʱ�ȭ
        String longestWord = "";
        
     // �ܾ� �迭�� ��ȸ�ϸ� ���� �� �ܾ� ã��
        for(String word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
     // ���� �� �ܾ� ��ȯ
        return longestWord;
    }
}
/*
�ڵ� ����: ���� �� �ܾ� �˻���
findLongestWord�޼��尡 ���Ե� �̿ϼ��� StringMagicŬ������ �����Ǿ� �ֽ��ϴ�. �������� ������ �� �޼��带 �ϼ��ϴ� ���Դϴ�.

�޼���� �־��� ���忡�� ���� �� �ܾ ã�ƾ� �մϴ�. ������ ���ڿ��� �޾� ���� �� �ܾ ���ڿ� ��°����μ� �����ؾ� �մϴ�.

������ ��� ���� ���, �޼���� �� ���ڿ��� �����ؾ� �մϴ�.

������ �޼����� �ñ״�ó�Դϴ�.

public String findLongestWord(String sentence)
�� 1: "A quick brown fox jumps over the lazy dog"��� ������ ���� "quick"�� ���̰� 5�μ� ���� �� �ܾ��Դϴ�.

�� 2: "Java is an object oriented programming language"��� ���忡���� �Լ��� "programming"�� �����ؾ� �մϴ�.



����

������ ��� �ְų� �� �� �Ǵ� �� �ڿ� ������ �ִ� ���� ���̽��� �� ó���Ͻñ� �ٶ��ϴ�.

����� ���ϴ�!

���� ����:
    public String findLongestWord(String sentence) {
 
        if (sentence.isEmpty()) {
            return "";
        }
 
        String[] words = sentence.split(" ");
 
        String longestWord = "";
        int maxLength = 0;
 
        for (String word : words) {
 
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
 		return longestWord;
    	}
	}
*/

