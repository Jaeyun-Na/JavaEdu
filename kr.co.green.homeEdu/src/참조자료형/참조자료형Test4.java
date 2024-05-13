package 참조자료형;

public class 참조자료형Test4 {
	public String findLongestWord(String sentence) {

        // TODO: Write your code here
		
//        String[] word = sentence.split(" ");	//오답:변수 이름과 12줄의 for반복문의 변수 이름이 겹침
        String[] words = sentence.split(" ");	//정답
        
        String longestWord = "";
        
        for(String word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }
}
/*
코딩 예제: 가장 긴 단어 검색기
findLongestWord메서드가 포함된 미완성인 StringMagic클래스가 제공되어 있습니다. 여러분의 과제는 그 메서드를 완성하는 것입니다.

메서드는 주어진 문장에서 가장 긴 단어를 찾아야 합니다. 문장을 문자열로 받아 가장 긴 단어를 문자열 출력값으로서 리턴해야 합니다.

문장이 비어 있을 경우, 메서드는 빈 문자열을 리턴해야 합니다.

다음은 메서드의 시그니처입니다.

public String findLongestWord(String sentence)
예 1: "A quick brown fox jumps over the lazy dog"라는 문장을 보면 "quick"이 길이가 5로서 가장 긴 단어입니다.

예 2: "Java is an object oriented programming language"라는 문장에서는 함수가 "programming"을 리턴해야 합니다.



참고

문장이 비어 있거나 맨 앞 또는 맨 뒤에 공백이 있는 엣지 케이스를 꼭 처리하시기 바랍니다.

행운을 빕니다!


*/