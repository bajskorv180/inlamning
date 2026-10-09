import java.util.ArrayList;
import java.util.List;

public class conunter {
    private int counter = 0;
    private List<String> list = new ArrayList<String>();
  public void add(String text){
      var split = text.split(" ");
      for (int i = 0; i < split.length; i++) {
          list.add(split[i]);
      }

      counter++;
  }
    public int getList(){
        return list.size();
    }

    public int getRow(){
        return counter;
    }
    public int getLetter(){

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i).length();
        }
        return count;
    }


}
