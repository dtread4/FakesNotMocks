public class FakeExchange implements Exchange{
  // Class to mimic behavior of Exchange.java, for use in unit testing

  @Override
  public float rate(String origin, String target) {
    return 0.95f;
  }
}
