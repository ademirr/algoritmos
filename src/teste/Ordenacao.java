package teste;

public class Ordenacao {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		int teste[] = {10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80, 10, 10, 10, 20, 30, 30, 30, -40, 50, 100, -90, 80, 20, -70, 60, -40, 10, 80, 80, 80};
		int teste2[] = new int[teste.length];
		for (int i = 0; i < teste.length; i++) {
			for (int j = 0; j < teste2.length; j++) {
				if (teste2[j] == 0) {
					teste2[j] = teste[i];
					if (j+1 < teste.length && teste2[j+1] == 0) {
						break;
					}
				} else if (teste[i] < teste2[j]) {
					int indice = j;
					for (int y = i+1; y>indice; y--) {
						if (y < teste.length) {
							teste2[y] = teste2[y-1];
						}
					}
					teste2[indice] = teste[i];
					break;
				}
			}
		}
		for (int x : teste2) {
			System.out.println(x);
		}
		System.out.println(System.currentTimeMillis());
	}
}
