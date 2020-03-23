class LongestSubString3 {

    public static int lengthOfLongestSubstring(String s) {
        int curLen = 0;
        String longest ="";

        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i + 1; j < s.length(); j++)
            {
                if (s.charAt(i) == s.charAt(j))
                {
                    curLen = (j - i) + 1;
                    if (curLen > longest.length())
                    {
                        longest = s.substring(i, j);
                    }
                    break;
                }
            }
        }

        return longest.length();
    }

	public static void main (String[] args)
	{
		String str ="abcabcbb";
		System.out.println("Longest Substring Length: " + lengthOfLongestSubstring(str));
	}
}
