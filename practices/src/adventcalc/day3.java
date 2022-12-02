package adventcalc;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class day3 {

	private List<Character> directions;

    public day3(File input) {
	directions = StaticUtils.fileToCharList(input);
    }

    public int run1() {
	Point2d pos = new Point2d(0, 0);

	Set<Point2d> visited = new HashSet<>();
	visited.add(pos);
	for (char dir : directions) {
	    pos = nextPos(dir, pos);
	    visited.add(pos);
	}

	return visited.size();
    }
    
    public int run2() {
	Point2d posSanta = new Point2d(0, 0);
	Point2d posRoboSanta = new Point2d(0, 0);

	Set<Point2d> visited = new HashSet<>();
	visited.add(posSanta);
	for (int i = 0; i < directions.size(); i++) {
	    if(i % 2 == 0) {
		posSanta = nextPos(directions.get(i), posSanta);
		visited.add(posSanta);
	    } else {
		posRoboSanta = nextPos(directions.get(i), posRoboSanta);
		visited.add(posRoboSanta);
	    }
	}

	return visited.size();
    }

    private Point2d nextPos(char dir, Point2d pos) {
	switch (dir) {
	case '^':
	    pos = new Point2d(pos.x(), pos.y() - 1);
	    break;
	case 'v':
	    pos = new Point2d(pos.x(), pos.y() + 1);
	    break;
	case '<':
	    pos = new Point2d(pos.x() - 1, pos.y());
	    break;
	case '>':
	    pos = new Point2d(pos.x() + 1, pos.y());
	    break;
	default:
	    throw new IllegalArgumentException(dir + " is not a valid direction.");
	}

	return pos;
    }

    public static void main(String[] args) {
	day3 test = new day3(new File("D:\\java\\practices\\src\\adventcalc\\day_3in.txt"));
	System.out.println(test.run2());
    }

}
