class dataType {
    public static void main(String[] args) {
        byte myByte  = 127; // 1 byte, Range: -128 to 127  
        short myShort = 32767; // 2 bytes, Range: -32,768 to 32,767 
        int myInt = 2147483647; // 4 bytes, Range: -2^31 to 2^31-1  
        long myLong = 9223372036854775807L; // 8 bytes, Range: -2^63 to 2^63-1  
        float myFloat = 3.14f; // 4 bytes, 6-7 decimal digits precision  
        double myDouble = 3.141592653589793; // 8 bytes, 15-16 decimal digits precision  
        char myChar = 'A'; // 2 bytes, Stores a single character  
        boolean myBoolean = true; // 1 bit, Stores true or false  
        // Print the values
        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Integer value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double value: " + myDouble);
        System.out.println("Character value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);

    }
}