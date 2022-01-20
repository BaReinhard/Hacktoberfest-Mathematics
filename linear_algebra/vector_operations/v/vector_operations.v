pub struct Vector {
	vector []f64
pub:
	size int
}

pub fn (a Vector) + (b Vector) Vector {
	if a.size != b.size {
		panic('Cannot add different sized vectors')
	}
	mut c := []f64{len: a.size}
	for i in 0 .. a.size {
		c[i] = a.vector[i] + b.vector[i]
	}
	return Vector{
		size: a.size
		vector: c
	}
}

pub fn (a Vector) - (b Vector) Vector {
	if a.size != b.size {
		panic('Cannot add different sized vectors')
	}
	mut c := []f64{len: a.size}
	for i in 0 .. a.size {
		c[i] = a.vector[i] - b.vector[i]
	}
	return Vector{
		size: a.size
		vector: c
	}
}

pub fn (v Vector) dot(a Vector) ?f64 {
	if a.size != v.size {
		return error('Cannot calculate dot product for different sized vectors')
	}
	mut sum := .0
	for i in 0 .. a.size {
		sum += v.vector[i] * a.vector[i]
	}
	return sum
}
