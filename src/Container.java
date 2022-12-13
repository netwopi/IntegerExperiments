public class Container
{
    public int count;

    public Container(int count) {
        this.count = count;
    }

    public Container() {
    }

    public Integer sumDigits(Integer count) {
        int a = 0 ;
        for (int s = 0 ; s <count.toString().length() ; s++){
            String y = String.valueOf(count.toString().charAt(s));
            int o = Integer.parseInt(y);
            a=a+o;
        }
        return a;
    }
}
