class IndexFirstOccurence {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;

            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        IndexFirstOccurence obj = new IndexFirstOccurence();

        String haystack = "hello";
        String needle = "ll";

        int result = obj.strStr(haystack, needle);

        System.out.println("Index of first occurrence: " + result);
    }
}