package com.hat.googleplay;

/**
 * 得到 DrawShow在葡萄牙语的排名
 * @author Administrator
 */
public class GetPortugueseRank implements AppRankInterface {

	public static void main(String[] args) {
		new GetPortugueseRank().getRank("com.energysh.drawshow", ApkCategory.COMICS.getName(), true);
	}

	
	@Override
	public void getRank(String packageName, String categoryName, boolean isFree) {
		// TODO Auto-generated method stub
		//获取分类排名
		try
		{
			System.out.println("------------- 葡萄牙语 -------------");
			//获取关键字排名
			String[] keys = {
					"dibujo tutor",
					"como desenhar",
					"desenhar quadrinhos",
					"Aprenda a desenhar",
					"tutoriales de dibujo",
					"Cómo Dibujar",

			};
			for(int i=0; i< keys.length; i++)
				System.out.println(KeyRank.getRank(packageName, keys[i]));
			System.out.println("------------- finish -------------");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
