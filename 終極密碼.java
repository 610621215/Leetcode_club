import java.util.*;
//
public class �׷��K�X {
	public static void main(String[]args) {
		class gaming {
			Random rd=new Random();
			public gaming() {
				int answer=create_answer();	
				botmod_gaming(answer);
//				System.out.println("���A�q�F");
//				go_gaming(answer);
		
			}
			public gaming(int mode) {
				int answer=create_answer();	
				botmod_gaming(answer);
				System.out.println("���A�q�F");
				go_gaming(answer);
			}
			public int create_answer() {
				int answer=rd.nextInt(100)+1;
				return answer;
			}
			public int botmod_gaming(int answer) {
				int count_guess=0;
				System.out.println("�q���q�F�G");
				count_guess=go_gaming(count_guess,answer);		
				return count_guess;
			}
			
			public int go_gaming(int answer) {
				Scanner input=new Scanner(System.in);
				int count_guess=0;
				System.out.println(answer);
				System.out.println("0 to 100");
				int guess=input.nextInt();
				count_guess++;
				int upper_bound=100;
				int lower_bound=0;
				boolean ending_game=true;
				while(ending_game&&guess!=answer) {
					if(rule(guess,upper_bound,lower_bound)) {
						upper_bound=update_upper(guess, answer, upper_bound);
						lower_bound=update_lower(guess, answer, lower_bound);
						System.out.println(lower_bound+" to " + upper_bound);
						ending_game=main_process(upper_bound,lower_bound);
						if(ending_game)
							guess=input.nextInt();
					}else {
						System.out.println("input_again");
						guess=input.nextInt();
					}
					count_guess++;
				}
				System.out.println("�@�@�q�F"+count_guess);
				return count_guess;
			}
			public int go_gaming(int count_guess,int answer) {
				System.out.println(answer);
				System.out.println("0 to 100");
				int guess=50;
				count_guess++;
				int upper_bound=100;
				int lower_bound=0;
				int anti_crash=0;
				if(answer==100) {
					anti_crash=1;
				}
				if(answer==1)
					anti_crash=-1;
				boolean ending_game=true;
				while(ending_game) {
					if(rule(guess,upper_bound,lower_bound)) {
						upper_bound=update_upper(guess, answer, upper_bound);
						lower_bound=update_lower(guess, answer, lower_bound);
						System.out.println(lower_bound+" to " + upper_bound);
						ending_game=main_process(upper_bound,lower_bound);
						if(ending_game)
							guess=(upper_bound+lower_bound)/2+anti_crash;
							
					}
					count_guess++;
				}
				System.out.println("�@�@�q�F"+count_guess+"��");
				return count_guess;
			}
			public boolean main_process(int upper_bound,int lower_bound) {	
				if(lower_bound==upper_bound) {
					return false;
				}
				return true;
			}
			public boolean rule(int guess,int upper_bound,int lower_bound) {
				if(lower_bound>guess||guess>upper_bound) {
					System.out.println("Invaild input");
					return false;
				}
				
				return true;
			}
			public int update_upper(int guess,int answer,int upper_bound) {
				if(guess>=answer) {
					return guess;
				}
				return upper_bound;
			}
			public int update_lower(int guess,int answer,int lower_bound) {
				if(answer>=guess) {
					return guess;
				}
				return lower_bound;
			}
		}
		class analysis{ 
			public analysis(Object game) {
				gaming gogame=(gaming)game;
				System.out.println(gogame.create_answer());
				int times=30000;//�q���q30000��
				double sum=0;
				for(int i=0;i<times;i++) {
					int answer=gogame.create_answer();
					System.out.println("�q���q��"+gogame.botmod_gaming(answer));
					sum+=gogame.botmod_gaming(answer);
					
				}
				
				System.out.println("�q���q��"+times+"����"+"�A�q�������q�����Ƭ�:"+((sum/times)));
			}
		}
		//�q���ĥΪ��ԳN�O�C�@���������q�̤j�̤p���@�b
		gaming go_game_bot=new gaming();//�q����
		analysis go_Analysis=new analysis(go_game_bot);
		gaming go_game_player=new gaming(1);//�H��
	}
}
