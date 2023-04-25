/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["../resources/templates/**/*.{html,js}"], // it will be explained later
  theme: {
    screens: {
      xs: "475px",
    },
    extend: {
      fontFamily: {
        syne: ["Syne", "sans-serif"],
        arimo: ["Arimo", "helvetica"],
        open: ["Open Sans", "helvetica"],
      },
      backgroundColor: {
        primary: ["#F8F8F8"],
      },
    },
  },
  plugins: [],
};
