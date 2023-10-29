public class Main {
    public static void main(String[] args) {
        createAndWork(new ArtistFactory());
        createAndWork(new MusicianFactory());
    }

    private static void createAndWork(WorkerFactory factory) {
        Worker worker = factory.createWorker();
        worker.work();
    }
}