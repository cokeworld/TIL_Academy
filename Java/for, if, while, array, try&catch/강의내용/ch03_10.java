package 강의내용;

public class ch03_10 {

	public static void main(String[] args) {
		int revenue[][] = {{4,5,7,2},
						{3,5,2,3},
						{2,5,3,1}};
		double revenueQuarterSum = 0;
		double revenueYearSum = 0;
		double revenueYearAverage = 0;
		int i = 0;
		
		int quarter = 1;
		int year = 2;
		
		for(i = 0; i < revenue.length; i++) {
			revenueQuarterSum = revenueQuarterSum + revenue[i][quarter-1];
		}
		System.out.println(revenueQuarterSum);
		
		for(i = 0; i < revenue[year-1].length; i++) {
			revenueYearSum = revenueYearSum + revenue[year-1][i];
			revenueYearAverage = revenueYearSum / revenue[year-1].length;
		}
		System.out.println(revenueYearAverage);
		
	}	
}
