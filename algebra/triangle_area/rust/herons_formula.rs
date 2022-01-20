fn area_from_sides(a: f64, b: f64, c: f64) -> f64 {
    let s = (a + b + c) / 2.0;
    (s * (s - a) * (s - b) * (s - c)).sqrt()
}

fn main() {
    println!("{}", area_from_sides(2.0, 3.0, 4.0))
}
