public class StreamComparator {
    public int equals (Potoc potoc1, Potoc potoc2) {
        int quantityGroup1 = potoc1.quantity();
        int quantityGroup2 = potoc2.quantity();

        return Integer.compare(quantityGroup1, quantityGroup2)
    }
}
