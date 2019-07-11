getJasmineRequireObj().toBeNegativeInfinity = function(j$) {
  /**
   * {@link expect} the actual value to be `-Infinity` (-infinity).
   * @function
   * @name matchers#toBeNegativeInfinity
   * @since 2.6.0
   * @example
   * expect(thing).toBeNegativeInfinity();
   */
  function toBeNegativeInfinity() {
    return {
      compare: function(actual) {
        var result = {
          pass: (actual === Number.NEGATIVE_INFINITY)
        };

        if (result.pass) {
          result.message = 'Expected actual not to be -Infinity.';
        } else {
          result.message = function() { return 'Expected ' + j$.pp(actual) + ' to be -Infinity.'; };
        }

        return result;
      }
    };
  }

  return toBeNegativeInfinity;
};
