public class MusicianFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new Musician();
    }
}