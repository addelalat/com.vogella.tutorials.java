//read all lines and remove whitespace (trim)
//filter empty lines
//and print result to System.out

Files.lines(new File("input.txt").toPath())
	.map(s -> s.trim())
 .filter(s -> !s.isEmpty())
 .forEach(System.out::println);