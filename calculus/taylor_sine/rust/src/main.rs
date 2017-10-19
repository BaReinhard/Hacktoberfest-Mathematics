use std::io;
use std::str::FromStr;

fn factorial(n: u64) -> u64 {
    match n {
        0 => 1,
        _ => n*factorial(n-1)
    }
}

fn read<T: FromStr>() -> T {
    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input)
            .expect("Failed to read line.");
        let input: T = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Please input a number.");
                continue;
            },
        };
        return input;
    }
}

fn main() {
    println!("Enter Taylor order: ");
    let order = read::<u64>();
    println!("Enter Taylor point of approximation: ");
    let x = read::<f64>();
    if order > 11 {
        println!("This operation would result in an overflow, aborting");
        std::process::exit(1);
    }
    let mut result: f64 = 0.0;
    print!{"Sin(x): "};
    for i in 1..order {
        let multiplier = match i {
            i if i % 2 != 1 => 1,
            _ => -1
        };
        let numerator = x.powi((2*i - 1) as i32);
        let denominator = factorial(2*i - 1);
        if multiplier == 1 {
            print!("x^{}/{}", 2*i-1, denominator);
            result += numerator / denominator as f64;
        } else {
            if i != 1 {
                print!("-x^{}/{}", 2*i-1, denominator);
                result -= numerator / denominator as f64;
            } else {
                print!("0");
            }
        }
        if i != order - 1 {
            print!(" + ");
        } else {
            println!("");
        }
        
    }
    println!("Sin({}) = {}", x, result);
}
