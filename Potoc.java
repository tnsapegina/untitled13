import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potoc implements Iterable<StudentGroup> {
  private List<StudentGroup> groupsList;

  public Potoc() {
    groupsList = new ArrayList<>();
  }

  public void addGroup(StudentGroup group) {
    groupsList.add(group);
  }
  @Override
  public Iterator<StudentGroup> iterator() {
    return groupsList.iterator();
  }
}
