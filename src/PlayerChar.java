public class PlayerChar {

	private String name;
	private int hp;
	private int str;
	private int con;
	private int dex;

	public PlayerChar(String name, int hp, int str, int con, int dex) {
		this.name = name;
		this.hp = hp;
		this.str = str;
		this.con = con;
		this.dex = dex;
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getStr() {
		return this.str;
	}

	public int getCon() {
		return this.con;
	}

	public int getdex() {
		return this.dex;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}


}