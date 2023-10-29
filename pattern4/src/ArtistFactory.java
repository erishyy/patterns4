public class ArtistFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new Artist();
    }
}