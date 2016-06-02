class Solution {
    /**
     * @return: The same instance of this class every time
     */
     
     
    private static volatile Solution instance = null ;
    
    public static Solution getInstance() {
        if (instance == null) {
            synchronized (Solution.class) {
                // Double check
                if (instance == null) {
                    instance = new Solution();
                }
            }
        }
        return instance;
    }
}


