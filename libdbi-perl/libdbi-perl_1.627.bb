SUMMARY = "DBI - Database independent interface for perl"
AUTHOR = "Tim Bounce <tim.bounce@pobox.com>"
HOMEPAGE = "https://metacpan.org/release/DBI"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.json;md5=5b1cbcd7b7d2ce82651c937bf9ebfe14"

RPROVIDES_${PN} = "libbundle-dbi-perl \
                  libdbd-dbm-perl \
                  libdbd-file-perl \
                  libdbd-gofer-perl \
                  libdbd-gofer-policy-base-perl \
                  libdbd-gofer-policy-classic-perl \
                  libdbd-gofer-policy-pedantic-perl \
                  libdbd-gofer-policy-rush-perl \
                  libdbd-gofer-transport-base-perl \
                  libdbd-gofer-transport-corostream-perl \
                  libdbd-gofer-transport-null-perl \
                  libdbd-gofer-transport-pipeone-perl \
                  libdbd-gofer-transport-stream-perl \
                  libdbd-proxy-perl \
                  libdbd-sponge-perl \
                  libdbi-const-getinfo-ansi-perl \
                  libdbi-const-getinfo-odbc-perl \
                  libdbi-const-getinforeturn-perl \
                  libdbi-const-getinfotype-perl \
                  libdbi-dbd-perl \
                  libdbi-dbd-metadata-perl \
                  libdbi-dbd-sqlengine-perl \
                  libdbi-gofer-execute-perl \
                  libdbi-gofer-request-perl \
                  libdbi-gofer-response-perl \
                  libdbi-gofer-serializer-storable-perl \
                  libdbi-gofer-serializer-base-perl \
                  libdbi-gofer-serializer-datadumper-perl \
                  libdbi-gofer-transport-base-perl \
                  libdbi-gofer-transport-pipeone-perl \
                  libdbi-gofer-transport-stream-perl \
                  libdbi-profile-perl \
                  libdbi-profiledata-perl \
                  libdbi-profiledumper-perl \
                  libdbi-profiledumper-apache-perl \
                  libdbi-proxyserver-perl \
                  libdbi-sql-nano-perl \
                  libdbi-util-cachememory-perl \
                  libdbi-w32odbc-perl \
                  libwin32-dbiodbc-perl \
                  "
                  
RDEPENDS_${PN} = "perl-module-scalar-util \
            libfile-spec-perl \
            libtest-simple-perl \
            "

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TI/TIMB/DBI-${PV}.tar.gz"
SRC_URI[md5sum] = "aab49be51b0f4867a1894145b023d2c5"
SRC_URI[sha256sum] = "875c1951a5e203c658f0f252e473b766dbcd299a987f86c17151fc6473b5856b"

S = "${WORKDIR}/DBI-${PV}"

do_configure() {
    perl -pi -e 'for my $c (qw(yes no undef)) { s/\bsv_$c\b/PL_sv_$c/}' Perl.xsi
    perl Makefile.PL POLLUTE=1
}

inherit cpan

BBCLASSEXTEND="native"


