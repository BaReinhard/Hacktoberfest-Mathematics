<?php
/**
 * A class to utilise the Haversine formula, to calculate great-circle distance between two points on a sphere
 */
    class Haversine {
        const EARTH_RADIUS = 6371;

        private $latitude;
        private $longitude;
        private $errors = [];

        private $round;
        private $conversions = [
            'miles'      => 0.621371192,
            'kilometres' => 1
        ];

        public function __construct($latitude, $longitude, $round = 2) {
            $this->latitude = $latitude;
            $this->longitude = $longitude;
            $this->round = $round;

            return $this;
        }

        public function distanceBetween($latitude, $longitude, $unit = 'miles') {
            $diffLat = deg2rad($this->latitude - $latitude);
            $diffLng = deg2rad($this->longitude - $longitude);
            $formula = sin($diffLat / 2) * sin($diffLat / 2) + cos(deg2rad($longitude)) *
                cos(deg2rad($latitude)) * sin($diffLng / 2) * sin($diffLng / 2);

            $distance = round(self::EARTH_RADIUS * (2 * asin(sqrt($formula))), $this->round);

            return $this->convert($distance, $unit);
        }

        private function convert($distance, $unit) {
            try {
                if (!array_key_exists($unit, $this->conversions)) {
                    throw new Exception(sprintf('Undefined conversion unit: "%s"', $unit));
                }

                $conversion = $this->conversions[$unit];

                return ($conversion != 1) ? round($distance * $conversion, $this->round) : $distance;
            } catch (Exception $e) {
                $this->errors[] = sprintf(
                    'Conversion unit "%s" does not exist. Try either miles or kilometres."',
                $unit);
            }

            return false;
        }

        public function getErrors() {
            return $this->errors;
        }
    }