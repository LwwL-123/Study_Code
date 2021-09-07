use std;
use rand::Rng;
use std::cmp::Ordering;
use std::io;

fn main() {
    println!("猜数");
    let screat_numeber = rand::thread_rng().gen_range(1, 100);
    println!("神秘数字是：{}", screat_numeber);

    loop {
        println!("请输入你猜的数：");
        //rust里面默认不可变constant，要加mut使变量可变
        let mut guess = String::new();

        io::stdin().read_line(&mut guess).expect("无法读取");
        let guess: u32 = match guess.trim().parse().expect("错误") {
            Ok(num) => num,
            Err(_) => continue,
        };//string转int

        match guess.cmp(&screat_numeber) {
            Ordering::Less => { println!("小了") }
            Ordering::Equal => {
                println!("相等");
                break;
            }
            Ordering::Greater => { println!("大了"); }
        }
    }
}
