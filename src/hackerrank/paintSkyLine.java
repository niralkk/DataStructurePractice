package hackerrank;

public class paintSkyLine {
	
	public static void main(String[] args) {
		int arr[] = {1,3,2,1,2,1,5,3,3,4,2};
		System.out.println("Num of stroke: "+computeBrushStrokes(arr));
	}

	private static int computeBrushStrokes(int[] A) {
		int currentHeight = 0;
		int strokeCount = 0;
		
		for(int i=0; i< A.length; i++) {
			if(currentHeight < A[i]) {
				strokeCount = strokeCount + A[i] - currentHeight;
			}
			currentHeight = A[i];
		}
		return strokeCount;
	}

}

/*
 * 
 * 
 * int strokeCount(IEnumerable<int> skyline)
{
    int level = 0;
    int strokes = 0;

    foreach (int height in skyline)
    {
        // if the building is higher than the current level, we need
        // to make (level - height) new strokes
        if (height > level)
        {
            strokes += height - level;
            level = height;
        }
        // if the building is lower than the current level, we need
        // to end the difference in strokes, but this doesn’t cost
        // “new” ones
        else if (height < level)
        {
            level = height;
        }
        // if we stay on the same level, don’t do anything

        // explicitely check for the maximum stroke count for every
        // building, so we can abort early
        if (strokes > 1000000000)
            return -1;
    }
    return strokes;
}

 * */
