public class Binaria {
	public static void main(String[] args) {
		int[] vector = { 1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68,
				69, 70, 73, 76, 77, 79, 80, 82 };
		int valorBuscado = 7;
		System.out.println(BusquedaBinaria(vector, valorBuscado));
	}

	public static int BusquedaBinaria(int vr[], int dat) {
		int n = vr.length;
		int valBuscado = dat;
		int centro;
		int inf = 0;
		int sup = n - 1;

		while (inf <= sup) {
			centro = inf + (sup - inf) / 2;
			if (vr[centro] == dat) {
				return centro;
			}
			if (dat < vr[centro]) {
				sup = centro - 1;
			} else {
				inf = centro + 1;
			}
		}
		return -1;
	}

}