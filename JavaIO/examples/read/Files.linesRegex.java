Files.lines(new File("input.txt").toPath())
	.map(s -> s.trim())
 .filter(s -> !s.matches("yourregularexpression"))
 .forEach(System.out::println);