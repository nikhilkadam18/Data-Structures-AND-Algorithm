// Java recursive program to solve tower of hanoi puzzle

class TOH {
	// Java recursive function to solve tower of hanoi puzzle
	static void towerOfHanoi(int n, char Start_rod, char End_rod, char Auxi_rod) {
		if (n == 1) {
			System.out.println("Move disk 1 from rod " + Start_rod + " to rod " + End_rod);
			return;
		}
		towerOfHanoi(n - 1, Start_rod, Auxi_rod, End_rod);
		System.out.println("Move disk " + n + " from rod " + Start_rod + " to rod " + End_rod);
		towerOfHanoi(n - 1, Auxi_rod, End_rod, Start_rod);
	}

	// Driver method
	public static void main(String args[]) {
		int n = 2; // Number of disks
		towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
	}
}
