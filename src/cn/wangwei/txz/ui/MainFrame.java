package cn.wangwei.txz.ui;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
//用作显示的主窗体
//需要继承Frame类----继承
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MainFrame extends Frame implements KeyListener{
	
	//最起码该设置一下窗口最基本的信息
	//1.1窗口是否显示
	//构造方法
	public MainFrame(){
		//制作一个背景，并将背景添加到窗体中
		//添加图片组件顺序
		//背景图片由于其实最大的图片，因此最后添加，其他内容先添加
		//做笼子(目标位置)
		
		targetInit();
		//做灰太狼（人物）
		wolfInit();
		
		
		//做懒洋洋
		sheepInit();
		
		treeInit();
		
		//添加各种各样要显示的东西。。。
		backgroundInit();
		
		
		
		//设置整个窗体
		setMainFrameUI();
		

		//使窗口能够监督用户是不是点了键盘
		this.addKeyListener(this); 
		
		}
	//场景数据模拟，使用二维数组模拟
	JLabel[][] sheeps = new JLabel[12][16];
	//1代表障碍，0代表空地
	//2代表人物
	int[][] datas = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1},
			{1,0,1,0,0,0,1,0,0,1,1,1,1,0,0,1},
			{1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,1,1,1,1,0,0,1},
			{1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1},
			{1,0,1,0,0,0,1,0,0,1,1,1,1,0,0,1},
			{1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};
	 int wx,sx1,sx2,sx3;
	 int wy,sy1,sy2,sy3;
	 //进入目标箱子数
	 int num = 0;
	 //箱子数
	 int total = 3; 

	private void  treeInit(){
		//1.创建图片
		Icon ic = new ImageIcon("tree.png");
		//遍历二维数组
		for (int i = 0;i<datas.length;i++){
			for (int j = 0;j<datas[i].length;j++){
				if(datas[i][j]==1){
				//2.创建JLabel
				JLabel lab_tree = new JLabel(ic);
				//设置大小设置
				lab_tree.setBounds(12+50*j,36+50*i,50,50);
				//添加到窗体中
				this.add(lab_tree);}
			}
		}
	}
	
	
	
	private void targetInit() {
		// //1.制作图片
		Icon i = new ImageIcon("target.png");
		JLabel lab_target1 = new JLabel(i);
		lab_target1.setBounds(712,236,50,50);
		this.add(lab_target1);
		
		JLabel lab_target2 = new JLabel(i);
		lab_target2.setBounds(712,286,50,50);
		this.add(lab_target2);
		
		JLabel lab_target3 = new JLabel(i);
		lab_target3.setBounds(712,336,50,50);
		this.add(lab_target3);
	}

	private void sheepInit() {
		
		sx1 = 6;sx2=6;sx3=6;
		sy1 = 4;sy2=6;sy3=8;
		//制作箱子的模型
		//创建一张图片
		Icon i = new ImageIcon("sheep-no.png");
		JLabel lab_sheep1 = new JLabel(i);
		lab_sheep1.setBounds(12+sx1*50,36+sy1*50,50,50);
		this.add(lab_sheep1);
		datas [sy1][sx1]= 4;
		sheeps [sy1][sx1]=lab_sheep1;
		
		//制作第二只羊，图片不需要制作了
		//第二只养制作时只需要修改显示位置
		JLabel lab_sheep2 = new JLabel(i);
		lab_sheep2.setBounds(12+sx2*50, 36+sy2*50, 50, 50);
		this.add(lab_sheep2);
		datas [sy2][sx2]= 4;
		sheeps [sy2][sx2]=lab_sheep2;
		
		JLabel lab_sheep3 = new JLabel(i);
		lab_sheep3.setBounds(12+sx3*50, 36+sy3*50, 50, 50);
		this.add(lab_sheep3);
		datas [sy3][sx3]= 4;
		sheeps [sy3][sx3]=lab_sheep3;
	}
	JLabel lab_sheep1;
	private void wolfInit() {
		//人物最初位置在哪里？
		wx = 4;
		wy = 5;
		
		
		
		//使用一张图片来模拟人物
		//1.创建一张图片、人物图片
		Icon i = new ImageIcon("wolf-zm.png");
		//使用 JLabel组件模拟人物
		lab_wolf = new JLabel(i);
		//3.设置人物在屏幕上的显示位置
		//人物的显示位置放置在何处较为合理？
		lab_wolf.setBounds(12+wx*50,36+wy*50,50,50);
		//4.把这个人物放到窗体里面
		this.add(lab_wolf);
		//把人物的数据添加到数组中
		//将人物对应的位置上的数据改为2
		datas[5][4]=2;
	}
	JLabel lab_wolf;//增加作用范围
	//背景初始化
	private void backgroundInit() {
		// TODO Auto-generated  method stub
		//背景是如何实现的？如何做背景
	
		//想使用图片做JLabel内部现实的内容
		//创建一个图片
		Icon i = new ImageIcon("bg.png");
		//使用JLabel制作背景
		JLabel lab_bg = new JLabel(i);
		//设置要添加的组件的位置与大小
		lab_bg.setBounds(12, 36,800, 600);
		//将这个东西添加到窗体里面
		this.add(lab_bg);
		
	}


	//设置主窗体界面显示效果
	private void setMainFrameUI(){	
		//设置整个窗体的布局模式为自由布局
		this.setLayout(null);
		//设置窗口标题
		this.setTitle("推箱子 v2.0 - java.wangwei");
		//设置窗口位置
		this.setLocation(110,30);
		//设置窗口尺寸，长400，宽300
		this.setSize(826,650);
		//设置窗口显示出来
		this.setVisible(true);
	}
	
	private void victory() {
		if(num == total)
			System.out.println("胜利");
	}
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated me//如何分辨用户点击的是键盘的某个键
		//通过键码值分辨是哪一个键
		//获取键码值的方式
		//key代表了你输入的是哪个键
		//左 37
		//上 38
		//右 39
		//下 40 
		
		int key = e.getKeyCode();
		if(key==39){	
			//让人物向右移动
			//方向上的第一位坐标wy wx+1
			//方向上的第一位坐标wy wx+2
			if(datas[wy][wx+1]==0){
				wx=wx+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x+50,y);
				
				Icon i = new ImageIcon("wolf-ym.png");
				lab_wolf.setIcon(i);
				return;
			}
			if(datas[wy][wx+1]==1)
				return;
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==1)
				return;
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==4)
				return;
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==12)
				return;
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==1)
				return;
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==4)
				return;
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==12)
				return;
			
			if(datas[wy][wx+1]==8){
				wx=wx+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x+50,y);
				
				Icon i = new ImageIcon("wolf-ym.png");
				lab_wolf.setIcon(i);
				return;
				
			}
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==0){
				datas[wy][wx+1] = 0;
				datas[wy][wx+2] = 4;
				
			}
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==8){
				datas[wy][wx+1] = 0;
				datas[wy][wx+2] = 12;
				num++;
			}	
				
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==0){
					datas[wy][wx+1] = 8;
					datas[wy][wx+2] = 4;
					num--;
				}		
				
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==8){
				datas[wy][wx+1] = 8;
				datas[wy][wx+2] = 12;
			}		
			
			
				sheeps[wy][wx+1].setLocation(12+wx*50+100,36+wy*50);
				sheeps[wy][wx+2] = sheeps[wy][wx+1];
				sheeps[wy][wx+1] = null;
				
				wx=wx+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x+50,y);
				
				Icon i = new ImageIcon("wolf-ym.png");
				lab_wolf.setIcon(i);
				//判断胜利
				victory();
				return;
				
	}
		 
		if(key==37){
			if(datas[wy][wx-1]==1)
				return;
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==1)
				return;
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==4)
				return;
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==12)
				return;
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==1)
				return;
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==4)
				return;
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==12)
				return;
			if(datas[wy][wx-1]==0){
				wx=wx-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x-50,y);
				
				Icon i = new ImageIcon("wolf-zuom.png");
				lab_wolf.setIcon(i);
				return;
			}
			if(datas[wy][wx-1]==8){
				wx=wx-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x-50,y);
				
				Icon i = new ImageIcon("wolf-zuom.png");
				lab_wolf.setIcon(i);
				return;
				
			}
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==0){
				datas[wy][wx-1] = 0;
				datas[wy][wx-2] = 4;
				
			}
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==8){
				datas[wy][wx-1] = 0;
				datas[wy][wx-2] = 12;
				num++;
			}	
				
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==0){
					datas[wy][wx-1] = 8;
					datas[wy][wx-2] = 4;
					num--;
				}		
				
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==8){
				datas[wy][wx-1] = 8;
				datas[wy][wx-2] = 12;
			}		
			
			
				sheeps[wy][wx-1].setLocation(12+wx*50-100,36+wy*50);
				sheeps[wy][wx-2] = sheeps[wy][wx-1];
				sheeps[wy][wx-1] = null;
				
				wx=wx-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x-50,y);
				
				Icon i = new ImageIcon("wolf-zuom.png");
				lab_wolf.setIcon(i);
				victory();
				return;
		
	}		
					
					
		if(key==38){
			//x向上移动
			
			if(datas[wy-1][wx]==1)
				return;
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==1)
				return;
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==4)
				return;
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==12)
				return;
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==1)
				return;
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==4)
				return;
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==12)
				return;
			if(datas[wy-1][wx]==0){
				wy=wy-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y-50);
				
				Icon i = new ImageIcon("wolf-hm.png");
				lab_wolf.setIcon(i);
				return;
			}
			if(datas[wy-1][wx]==8){
				wy=wy-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y-50);
				
				Icon i = new ImageIcon("wolf-hm.png");
				lab_wolf.setIcon(i);
				return;
				
			}
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==0){
				datas[wy-1][wx] = 0;
				datas[wy-2][wx] = 4;
				
			}
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==8){
				datas[wy-1][wx] = 0;
				datas[wy-2][wx] = 12;
				num++;
			}	
				
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==0){
					datas[wy-1][wx] = 8;
					datas[wy-2][wx] = 4;
					num--;
				}		
				
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==8){
				datas[wy-1][wx] = 8;
				datas[wy-2][wx] = 12;
			}		
			
			
				sheeps[wy-1][wx].setLocation(12+wx*50,36+wy*50-100);
				sheeps[wy-2][wx] = sheeps[wy-1][wx];
				sheeps[wy-1][wx] = null;
				
				wy=wy-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y-50);
				
				Icon i = new ImageIcon("wolf-hm.png");
				lab_wolf.setIcon(i);
				victory();
				return;
		 }	 
		
		
		
		
		
		
		if(key==40){
			//向下移动
			
			if(datas[wy+1][wx]==1)
				return;
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==1)
				return;
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==4)
				return;
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==12)
				return;
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==1)
				return;
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==4)
				return;
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==12)
				return;
			if(datas[wy+1][wx]==0){
				wy=wy+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y+50);
				
				Icon i = new ImageIcon("wolf-zm.png");
				lab_wolf.setIcon(i);
				return;
			}
			if(datas[wy+1][wx]==8){
				wy=wy+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y+50);
				
				Icon i = new ImageIcon("wolf-zm.png");
				lab_wolf.setIcon(i);
				return;
				
			}
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==0){
				datas[wy+1][wx] = 0;
				datas[wy+2][wx] = 4;
				
			}
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==8){
				datas[wy+1][wx] = 0;
				datas[wy+2][wx] = 12;
				num++;
			}	
				
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==0){
					datas[wy+1][wx] = 8;
					datas[wy+2][wx] = 4;
					num--;
				}		
				
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==8){
				datas[wy+1][wx] = 8;
				datas[wy+2][wx] = 12;
			}		
			
			
				sheeps[wy+1][wx].setLocation(12+wx*50,36+wy*50+100);
				sheeps[wy+2][wx] = sheeps[wy+1][wx];
				sheeps[wy+1][wx] = null;
				
				wy=wy+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y+50);
				
				Icon i = new ImageIcon("wolf-zm.png");
				lab_wolf.setIcon(i);
				victory();
				return;
		}
	
	}
	
	



	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
