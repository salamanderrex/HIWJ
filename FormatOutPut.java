byte [] bytes = ByteBuffer.allocate(4).putInt(15).array();
System.out.println(Arrays.toString(bytes));
for (byte b : bytes) {
        System.out.format("0x%x",b);
}