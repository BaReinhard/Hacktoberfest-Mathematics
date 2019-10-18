#ifndef VECTOR_H
#include VECTOR_H

#include <cmath>
#include <vector>

namespace linalg {
    class column_mistmatch {};

    class vector {
        private:
            std::vector<double> v;
        public:
            explicit vector(std::vector<double> &v): v{v} {}

            vector(std::initializer_list<double> init): v{} {
                for (auto &x: init) v.push_back(x);
            }

            double dot(const vector &other) const {
                if (other.size() != size()) throw column_mistmatch{};
                double result = 0;

                for (size_t i = 0; i < size(); ++i) result += v[i] * other.v[i];
                return result;
            }

            double norm() const {
                return sqrt(this->dot(*this));
            }

            vector operator+(const vector &other) const {
                if (other.size() != size()) throw column_mistmatch{};
                std::vector<double> sum;
                sum.reserve(size());

                for (size_t i = 0; i < size(); ++i) {
                    sum.push_back(v[i] + other.v[i]);
                }

                return vector(sum);
            }

            double operator[](size_t i) const { return v[i]; }

            size_t size() const noexcept { return v.size(); }

            friend std::ostream &operator<<(std::ostream &out, const vector &v);
    };

    std::ostream &operator<<(std::ostream &out, const vector &v) {
        for (auto &x: v.v) out << x << ' ';
        return out;
    }
}

#endif // VECTOR_H
