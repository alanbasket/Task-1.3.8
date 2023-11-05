public class Age {
    public static void main(String[] args) {
        byte calculatgetAgeDiff = getAgeDiff((byte) 15, (byte) 23);
        System.out.println(calculatgetAgeDiff);
    }
    public static byte getAgeDiff(byte age1, byte age2){
return (byte) Math.abs(age1 - age2);
    }
}