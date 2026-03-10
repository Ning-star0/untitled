package exercises;

public class GenericInterface {
    public interface DataComparator<T>{
        int compare(T data1,T data2);
    }
    static class IntegerComparator implements DataComparator<Integer>{
        @Override
        public int compare(Integer data1,Integer data2){
            return (data1>data2)?1:-1;
        }
    }
    public static void main(String[] args) {
        IntegerComparator o1=new IntegerComparator();
        System.out.println(o1.compare(1,2));
        System.out.println(o1.compare(6,2));
    }
}
