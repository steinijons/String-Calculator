package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		//int negValue = Integer.parseInt(text);
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else if(text.startsWith("//")){
			return sum(splitByGiven(text));
		}
		/*else if(negValue < 0){
				throw new ExceptionNegative();
		}*/
		else
			return toInt(text);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }

    private static String[] splitByGiven(String numbers){
	    String[] part = numbers.split("\n");
		String delimiter = part[0].substring(2);
		numbers = part[1];
	    return numbers.split(delimiter);
	}
}