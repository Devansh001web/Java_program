// Bloom Filter
public class DS_48_BloomFilter {
    private byte[] bitArray;
    private int size;
    private int hashFunctions;
    
    public DS_48_BloomFilter(int size, int hashFunctions) {
        this.size = size;
        this.hashFunctions = hashFunctions;
        this.bitArray = new byte[(size + 7) / 8];
    }
    
    public void add(String element) {
        for (int i = 0; i < hashFunctions; i++) {
            int hash = hashFunction(element, i);
            int index = Math.abs(hash) % size;
            setBit(index);
        }
    }
    
    public boolean contains(String element) {
        for (int i = 0; i < hashFunctions; i++) {
            int hash = hashFunction(element, i);
            int index = Math.abs(hash) % size;
            if (!getBit(index)) return false;
        }
        return true;
    }
    
    private void setBit(int index) {
        bitArray[index / 8] |= (byte) (1 << (index % 8));
    }
    
    private boolean getBit(int index) {
        return (bitArray[index / 8] & (byte) (1 << (index % 8))) != 0;
    }
    
    private int hashFunction(String element, int seed) {
        return (element.hashCode() ^ seed) * 31;
    }
}
