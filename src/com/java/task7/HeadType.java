package com.java.task7;

public enum HeadType implements Functions <String> {
    CAT {
        @Override
        public String say() {
            return "mr-mr-mr";
        }

        @Override
        public String movementEye() {
            return "умеет подмигивать";
        }
    },
    DOG {
        @Override
        public String say() {
            return "rrrrrrr-rrr-rr-r";
        }

        @Override
        public String movementEye() {
            return "двигает ухом";
        }
    },
    BEAR {
        @Override
        public String say() {
            return "эээээ";
        }

        @Override
        public String movementEye() {
            return "без дополнительных функций";
        }
    }
}
